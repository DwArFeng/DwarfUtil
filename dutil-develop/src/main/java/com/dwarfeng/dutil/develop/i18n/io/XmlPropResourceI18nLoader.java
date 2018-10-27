package com.dwarfeng.dutil.develop.i18n.io;

import java.io.InputStream;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.dwarfeng.dutil.basic.DwarfUtil;
import com.dwarfeng.dutil.basic.ExceptionStringKey;
import com.dwarfeng.dutil.basic.io.LoadFailedException;
import com.dwarfeng.dutil.basic.io.StreamLoader;
import com.dwarfeng.dutil.basic.str.FactoriesByString;
import com.dwarfeng.dutil.develop.i18n.I18nHandler;
import com.dwarfeng.dutil.develop.i18n.PropUrlI18nInfo;

/**
 * Xml属性资源国际化读取器。
 * <p>
 * 通过Xml文件和 properties 包内资源向国际化处理器中读取数据的读取器。
 * 
 * <p>
 * Xml 文件的格式如下：
 * 
 * <pre>
 * &lt;root&gt;
 * 	 &lt;info-default name="默认" resource="directory/zh_CN.properties"/&gt;
 * 	 &lt;info locale="en_US" name="English" file="directory/en_US.properties"/&gt;
 *	 &lt;info locale="en_US" name="English" resource="directory/en_US.properties"/&gt;
 *	 &lt;info locale="zh_CN" name="简体中文" resource="directory/zh_CN.properties"/&gt;
 *	 &lt;info locale="ja_JP" name="日本語" resource="directory/ja_JP.properties"/&gt;
 * &lt;/root&gt;
 * </pre>
 * 
 * @author DwArFeng
 * @since 0.1.1-beta
 */
public class XmlPropResourceI18nLoader extends StreamLoader<I18nHandler> {

	private boolean readFlag = false;

	/**
	 * 生成一个具有指定输入流的 xml属性资源国际化读取器。
	 * 
	 * @param in
	 *            指定的输入流。
	 * @throws NullPointerException
	 *             入口参数为 <code>null</code>。
	 */
	public XmlPropResourceI18nLoader(InputStream in) {
		super(in);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void load(I18nHandler i18nHandler) throws LoadFailedException, IllegalStateException {
		if (readFlag)
			throw new IllegalStateException(
					DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_0));

		Objects.requireNonNull(i18nHandler,
				DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_1));

		try {
			readFlag = true;

			SAXReader reader = new SAXReader();
			Element root = reader.read(in).getRootElement();

			Element info_default;
			if (Objects.nonNull(info_default = root.element("info-default"))) {
				String defaultNameString = info_default.attributeValue("name");
				String defaultResourceString = info_default.attributeValue("resource");

				if (Objects.isNull(defaultNameString) || Objects.isNull(defaultResourceString)) {
					throw new LoadFailedException(
							DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_3));
				}

				URL defaultUrl = XmlPropResourceI18nLoader.class.getResource(defaultResourceString);

				i18nHandler.add(new PropUrlI18nInfo(null, defaultNameString, defaultUrl));
			}

			/*
			 * 根据 dom4j 的相关说明，此处转换是安全的。
			 */
			@SuppressWarnings("unchecked")
			List<Element> infos = (List<Element>) root.elements("info");

			for (Element info : infos) {
				String localeString = info.attributeValue("locale");
				String nameString = info.attributeValue("name");
				String resourceString = info.attributeValue("resource");

				if (Objects.isNull(localeString) || Objects.isNull(nameString) || Objects.isNull(resourceString)) {
					throw new LoadFailedException(
							DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_3));
				}

				URL url = XmlPropResourceI18nLoader.class.getResource(resourceString);
				Locale locale = FactoriesByString.newLocale(localeString);

				i18nHandler.add(new PropUrlI18nInfo(locale, nameString, url));
			}

		} catch (Exception e) {
			throw new LoadFailedException(DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_2));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Set<LoadFailedException> countinuousLoad(I18nHandler i18nHandler) throws IllegalStateException {
		if (readFlag)
			throw new IllegalStateException(
					DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_0));

		Objects.requireNonNull(i18nHandler,
				DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_1));

		final Set<LoadFailedException> exceptions = new LinkedHashSet<>();
		try {
			readFlag = true;

			SAXReader reader = new SAXReader();
			Element root = reader.read(in).getRootElement();

			try {
				Element info_default;
				if (Objects.nonNull(info_default = root.element("info-default"))) {
					String defaultNameString = info_default.attributeValue("name");
					String defaultResourceString = info_default.attributeValue("resource");

					if (Objects.isNull(defaultNameString) || Objects.isNull(defaultResourceString)) {
						throw new LoadFailedException(
								DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_3));
					}

					URL defaultRrl = XmlPropResourceI18nLoader.class.getResource(defaultResourceString);

					i18nHandler.add(new PropUrlI18nInfo(null, defaultNameString, defaultRrl));
				}
			} catch (Exception e) {
				exceptions.add(new LoadFailedException(
						DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_2), e));
			}

			/*
			 * 根据 dom4j 的相关说明，此处转换是安全的。
			 */
			@SuppressWarnings("unchecked")
			List<Element> infos = (List<Element>) root.elements("info");

			for (Element info : infos) {
				try {
					String localeString = info.attributeValue("locale");
					String nameString = info.attributeValue("name");
					String resourceString = info.attributeValue("resource");

					if (Objects.isNull(localeString) || Objects.isNull(nameString) || Objects.isNull(resourceString)) {
						throw new LoadFailedException(
								DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_3));
					}

					URL url = XmlPropResourceI18nLoader.class.getResource(resourceString);
					Locale locale = FactoriesByString.newLocale(localeString);

					i18nHandler.add(new PropUrlI18nInfo(locale, nameString, url));
				} catch (Exception e) {
					exceptions.add(new LoadFailedException(
							DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_2), e));
				}

			}

		} catch (Exception e) {
			exceptions.add(new LoadFailedException(
					DwarfUtil.getExceptionString(ExceptionStringKey.XMLPROPRESOURCEI18NLOADER_2), e));
		}

		return exceptions;

	}
}
