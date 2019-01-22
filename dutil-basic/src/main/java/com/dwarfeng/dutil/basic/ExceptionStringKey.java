package com.dwarfeng.dutil.basic;

import com.dwarfeng.dutil.basic.str.Name;

/**
 * 关于这个工具包的所有异常文本字段的主键枚举。
 * <p>
 * 此枚举是对内使用的，它的主要作用是返回内部类所需要的一些字段（尤其是异常字段）。 <br>
 * 请不要在外部程序中调用此包的枚举，因为该枚举对内使用，其本身不保证兼容性。
 * <p>
 * <b>注意：</b> 该枚举在设计的时候不考虑兼容性，当发生不向上兼容的改动时，作者没有义务在变更日志中说明。
 * 
 * @author DwArFeng
 * @since 0.0.2-beta
 */
public enum ExceptionStringKey implements Name {

	WELCOME_STRING("WelcomeString"), //
	CLASSUTIL_0("ClassUtil.0"), //
	CLASSUTIL_1("ClassUtil.1"), //
	CLASSUTIL_2("ClassUtil.2"), //
	CLASSUTIL_3("ClassUtil.3"), //
	DUPLICATEIDEXCEPTION_0("DuplicateIdException.0"), //
	TOSTRINGCOMPARATOR_0("ToStringComparator.0"), //
	JADJUSTABLEBORDERPANEL_0("JAdjustableBorderPanel.0"), //
	TAGRUNNER_0("TagRunner.0"), //
	TAGRUNNER_1("TagRunner.1"), //
	TIMEMEASURER_0("TimeMeasurer.0"), //
	TIMEMEASURER_1("TimeMeasurer.1"), //
	TIMEMEASURER_2("TimeMeasurer.2"), //
	TIMEMEASURER_3("TimeMeasurer.3"), //
	TIMEMEASURER_4("TimeMeasurer.4"), //
	TIMEMEASURER_5("TimeMeasurer.5"), //
	EVENTLISTENERWEAKSET_0("EventListenerWeakSet.0"), //
	MUALISTMODEL_0("MuaListModel.0"), //
	MUALISTMODEL_1("MuaListModel.1"), //
	STRINGOUTPUTSTREAM_0("StringOutputStream.0"), //
	STRINGOUTPUTSTREAM_1("StringOutputStream.1"), //
	STRINGINPUTSTREAM_0("StringInputStream.0"), //
	STRINGINPUTSTREAM_1("StringInputStream.1"), //
	STRINGINPUTSTREAM_2("StringInputStream.2"), //
	STRINGINPUTSTREAM_3("StringInputStream.3"), //
	STRINGINPUTSTREAM_4("StringInputStream.4"), //
	ARRAYUTIL_0("ArrayUtil.0"), //
	ARRAYUTIL_1("ArrayUtil.1"), //
	ARRAYUTIL_2("ArrayUtil.2"), //
	ARRAYUTIL_3("ArrayUtil.3"), //
	ARRAYUTIL_4("ArrayUtil.4"), //
	ARRAYUTIL_5("ArrayUtil.5"), //
	FOTHALGEBRAUTIL_0("FothAlgebraUtil.0"), //
	FOTHALGEBRAUTIL_1("FothAlgebraUtil.1"), //
	FOTHALGEBRAUTIL_2("FothAlgebraUtil.2"), //
	ALGEBRA_REALNUMBER("Algebra_RealNumber"), //
	ALGEBRA_VARIABLE("Algebra_Variable"), //
	Algebra_VariableSpace("Algebra_VariableSpace"), //
	Linalge_RowVector("Linalge_RowVector"), //
	Linalge_ColVector("Linalge_ColVector"), //
	Linalge_Matrix("Linalge_Matrix"), //
	COLLECTIONUTIL_0("CollectionUtil.0"), //
	COLLECTIONUTIL_1("CollectionUtil.1"), //
	COLLECTIONUTIL_2("CollectionUtil.2"), //
	COLLECTIONUTIL_3("CollectionUtil.3"), //
	COLLECTIONUTIL_4("CollectionUtil.4"), //
	COLLECTIONUTIL_5("CollectionUtil.5"), //
	COLLECTIONUTIL_6("CollectionUtil.6"), //
	COLLECTIONUTIL_7("CollectionUtil.7"), //
	COLLECTIONUTIL_8("CollectionUtil.8"), //
	COLLECTIONUTIL_9("CollectionUtil.9"), //
	COLLECTIONUTIL_10("CollectionUtil.10"), //
	COLLECTIONUTIL_11("CollectionUtil.11"), //
	COLLECTIONUTIL_12("CollectionUtil.12"), //
	COLLECTIONUTIL_13("CollectionUtil.13"), //
	COLLECTIONUTIL_14("CollectionUtil.14"), //
	COLLECTIONUTIL_15("CollectionUtil.15"), //
	COLLECTIONUTIL_16("CollectionUtil.16"), //
	COLLECTIONUTIL_17("CollectionUtil.17"), //
	COLLECTIONUTIL_18("CollectionUtil.18"), //
	COLLECTIONUTIL_19("CollectionUtil.19"), //
	COLLECTIONUTIL_20("CollectionUtil.20"), //
	COLLECTIONUTIL_21("CollectionUtil.21"), //
	NameableComparator_0("NameableComparator.0"), //
	FothValueComparator_0("FothValueComparator.0"), //
	QuickFothVariable_0("QuickFothVariable.0"), //
	QuickFothVariable_1("QuickFothVariable.1"), //
	FothVariable_0("FothVariable.0"), //
	DefaultFormulaRowVector_0("DefaultFormulaRowVector.0"), //
	DefaultFormulaRowVector_1("DefaultFormulaRowVector.1"), //
	DefaultFormulaRowVector_2("DefaultFormulaRowVector.2"), //
	DefaultFormulaRowVector_3("DefaultFormulaRowVector.3"), //
	DefaultFormulaRowVector_4("DefaultFormulaRowVector.4"), //
	DefaultFormulaRowVector_5("DefaultFormulaRowVector.5"), //
	DefaultFormulaRowVector_6("DefaultFormulaRowVector.6"), //
	DefaultFormulaRowVector_7("DefaultFormulaRowVector.7"), //
	DefaultFormulaRowVector_8("DefaultFormulaRowVector.8"), //
	DefaultFormulaColumnVector_0("DefaultFormulaColumnVector.0"), //
	DefaultFormulaColumnVector_1("DefaultFormulaColumnVector.1"), //
	DefaultFormulaColumnVector_2("DefaultFormulaColumnVector.2"), //
	DefaultFormulaColumnVector_3("DefaultFormulaColumnVector.3"), //
	DefaultFormulaColumnVector_4("DefaultFormulaColumnVector.4"), //
	DefaultFormulaColumnVector_5("DefaultFormulaColumnVector.5"), //
	DefaultFormulaColumnVector_6("DefaultFormulaColumnVector.6"), //
	LinalgeUtil_0("LinalgeUtil.0"), //
	LinalgeUtil_1("LinalgeUtil.1"), //
	LinalgeUtil_2("LinalgeUtil.2"), //
	LinalgeUtil_3("LinalgeUtil.3"), //
	LinalgeUtil_4("LinalgeUtil.4"), //
	FothValue_0("FothValue.0"), //
	DefaultFormulaMatrix_0("DefaultFormulaMatrix.0"), //
	DefaultFormulaMatrix_1("DefaultFormulaMatrix.1"), //
	DefaultFormulaMatrix_2("DefaultFormulaMatrix.2"), //
	DefaultFormulaMatrix_3("DefaultFormulaMatrix.3"), //
	DefaultFormulaMatrix_4("DefaultFormulaMatrix.4"), //
	DefaultFormulaMatrix_5("DefaultFormulaMatrix.5"), //
	DefaultFormulaMatrix_6("DefaultFormulaMatrix.6"), //
	DefaultColumnVector_0("DefaultColumnVector.0"), //
	DefaultColumnVector_1("DefaultColumnVector.1"), //
	DefaultColumnVector_2("DefaultColumnVector.2"), //
	DefaultColumnVector_3("DefaultColumnVector.3"), //
	DefaultColumnVector_4("DefaultColumnVector.4"), //
	DefaultRowVector_0("DefaultRowVector.0"), //
	DefaultRowVector_1("DefaultRowVector.1"), //
	DefaultRowVector_2("DefaultRowVector.2"), //
	DefaultRowVector_3("DefaultRowVector.3"), //
	DefaultRowVector_4("DefaultRowVector.4"), //
	DefaultRowVector_5("DefaultRowVector.5"), //
	DefaultRowVector_6("DefaultRowVector.6"), //
	DefaultMatrix_0("DefaultMatrix.0"), //
	DefaultMatrix_1("DefaultMatrix.1"), //
	DefaultMatrix_2("DefaultMatrix.2"), //
	DefaultMatrix_3("DefaultMatrix.3"), //
	DefaultMatrix_4("DefaultMatrix.4"), //
	DefaultMatrix_5("DefaultMatrix.5"), //
	FormulaLinalgeUtil_0("FormulaLinalgeUtil.0"), //
	FormulaLinalgeUtil_1("FormulaLinalgeUtil.1"), //
	FothVariableSpace_0("FothVariableSpace.0"), //
	FothVariableSpace_1("FothVariableSpace.1"), //
	DefaultTag_0("DefaultTag.0"), //
	DefaultTag_1("DefaultTag.1"), //
	DefaultListItemModel_0("DefaultListItemModel.0"), //
	DefaultListItemModel_1("DefaultListItemModel.1"), //
	DefaultListItemModel_2("DefaultListItemModel.2"), //
	DefaultListItemModel_3("DefaultListItemModel.3"), //
	DefaultListItemModel_4("DefaultListItemModel.4"), //
	DefaultListItemModel_5("DefaultListItemModel.5"), //
	DefaultListItemModel_6("DefaultListItemModel.6"), //
	JointIterator_0("JointIterator.0"), //
	JointIterator_1("JointIterator.1"), //
	JointIterator_2("JointIterator.2"), //
	NUMBERUTIL_0("NumberUtil.0"), //
	NUMBERUTIL_1("NumberUtil.1"), //
	NUMBERUTIL_2("NumberUtil.2"), //
	StreamConfigLoader_0("StreamConfigLoader.0"), //
	StreamConfigSaver_0("StreamConfigSaver.0"), //
	ConfigKey_0("ConfigKey.0"), //
	SWINGUTIL_0("SwingUtil.0"), //
	SWINGUTIL_1("SwingUtil.1"), //
	ConfigViewModel_0("ConfigViewModel.0"), //
	ConfigViewModel_1("ConfigViewModel.1"), //
	ConfigTablePanel_0("ConfigTablePanel.0"), //
	ConfigTablePanel_1("ConfigTablePanel.1"), //
	DefaultConfigModel_0("DefaultConfigModel.0"), //
	DefaultConfigModel_1("DefaultConfigModel.1"), //
	DefaultConfigModel_2("DefaultConfigModel.2"), //
	DefaultConfigModel_3("DefaultConfigModel.3"), //
	DefaultConfigModel_4("DefaultConfigModel.4"), //
	DefaultConfigModel_5("DefaultConfigModel.5"), //
	PROPERTIESCONFIGSAVER_0("PropertiesConfigSaver.0"), //
	PROPERTIESCONFIGSAVER_1("PropertiesConfigSaver.1"), //
	PROPERTIESCONFIGLOADER_0("PropertiesConfigLoader.0"), //
	PROPERTIESCONFIGLOADER_1("PropertiesConfigLoader.1"), //
	CONFIGUTIL_0("ConfigUtil.0"), //
	CONFIGUTIL_1("ConfigUtil.1"), //
	DefaultConfigFirmProps_0("DefaultConfigFirmProps.0"), //
	DefaultConfigFirmProps_1("DefaultConfigFirmProps.1"), //
	DefaultConfigFirmProps_2("DefaultConfigFirmProps.2"), //
	FactoriesByString_0("FactoriesByString.0"), //
	FactoriesByString_1("FactoriesByString.1"), //
	NumberedThreadFactory_0("NumberedThreadFactory.0"), //
	JEXCONSOLE_0("JExconsole.0"), //
	JEXCONSOLE_1("JExconsole.1"), //
	JEXCONSOLE_2("JExconsole.2"), //
	JEXCONSOLE_3("JExconsole.3"), //
	JEXCONSOLE_4("JExconsole.4"), //
	STREAMLOADER_0("StreamLoader.0"), //
	STREAMSAVER_0("StreamSaver.0"), //
	ABSTRACTLISTMODEL_0("AbstractListModel.0"), //
	ABSTRACTSETMODEL_0("AbstractSetModel.0"), //
	ABSTRACTMAPMODEL_0("AbstractMapModel.0"), //
	ABSTRACTKEYLISTMODEL_0("AbstractKeyListModel.0"), //
	ABSTRACTKEYSETMODEL_0("AbstractKeySetModel.0"), //
	MODELUTIL_0("ModelUtil.0"), //
	MODELUTIL_1("ModelUtil.1"), //
	MODELUTIL_2("ModelUtil.2"), //
	MODELUTIL_3("ModelUtil.3"), //
	MODELUTIL_4("ModelUtil.4"), //
	MODELUTIL_5("ModelUtil.5"), //
	MODELUTIL_6("ModelUtil.6"), //
	MODELUTIL_7("ModelUtil.7"), //
	MODELUTIL_8("ModelUtil.8"), //
	ABSTRACTEXCONFIGMODEL_0("AbstractExconfigModel.0"), //
	DEFAULTEXCONFIGMODEL_0("DefaultExconfigModel.0"), //
	DEFAULTEXCONFIGMODEL_1("DefaultExconfigModel.1"), //
	DEFAULTEXCONFIGMODEL_2("DefaultExconfigModel.2"), //
	DEFAULTEXCONFIGMODEL_3("DefaultExconfigModel.3"), //
	DELEGATELISTMODEL_0("DelegateListModel.0"), //
	DELEGATELISTMODEL_1("DelegateListModel.1"), //
	DELEGATESETMODEL_0("DelegateSetModel.0"), //
	DELEGATESETMODEL_1("DelegateSetModel.1"), //
	DELEGATEMAPMODEL_0("DelegateMapModel.0"), //
	DELEGATEMAPMODEL_1("DelegateMapModel.1"), //
	DELEGATEMAPMODEL_2("DelegateMapModel.2"), //
	DELEGATEKEYLISTMODEL_0("DelegateKeyListModel.0"), //
	MAPKEYSETMODEL_0("MapKeySetModel.0"), //
	MAPKEYSETMODEL_1("MapKeySetModel.1"), //
	DELEGATEKEYSETMODEL_0("DelegateKeySetModel.0"), //
	ABSTRACTBACKGROUND_0("AbstractBackground.0"), //
	EXECUTORSERVICEBACKGROUND_0("ExecutorServiceBackground.0"), //
	EXECUTORSERVICEBACKGROUND_1("ExecutorServiceBackground.1"), //
	EXECUTORSERVICEBACKGROUND_2("ExecutorServiceBackground.2"), //
	BACKGROUNDUTIL_0("BackgroundUtil.0"), //
	BACKGROUNDUTIL_1("BackgroundUtil.1"), //
	BACKGROUNDUTIL_2("BackgroundUtil.2"), //
	BACKGROUNDUTIL_3("BackgroundUtil.3"), //
	BACKGROUNDUTIL_4("BackgroundUtil.4"), //
	BACKGROUNDUTIL_5("BackgroundUtil.5"), //
	BACKGROUNDUTIL_6("BackgroundUtil.6"), //
	RESOURCEUTIL_0("ResourceUtil.0"), //
	RESOURCEUTIL_1("ResourceUtil.1"), //
	RESOURCEUTIL_2("ResourceUtil.2"), //
	DELEGATERESOURCEHANDLER_0("DelegateResourceHandler.0"), //
	ABSTRACTRESOURCE_0("AbstractResource.0"), //
	URL2FILERESOURCE_0("Url2FileResource.0"), //
	URL2FILERESOURCE_1("Url2FileResource.1"), //
	XMLJAR2FILERESOURCELOADER_0("XmlJar2FileResourceLoader.0"), //
	XMLJAR2FILERESOURCELOADER_1("XmlJar2FileResourceLoader.1"), //
	XMLJAR2FILERESOURCELOADER_2("XmlJar2FileResourceLoader.2"), //
	XMLJAR2FILERESOURCELOADER_3("XmlJar2FileResourceLoader.3"), //
	XMLJAR2FILERESOURCELOADER_4("XmlJar2FileResourceLoader.4"), //
	XMLJAR2FILERESOURCELOADER_5("XmlJar2FileResourceLoader.5"), //
	ABSTRACTI18NINFO_1("AbstractI18nInfo.1"), //
	I18NUTIL_0("I18nUtil.0"), //
	I18NUTIL_1("I18nUtil.1"), //
	I18NUTIL_2("I28nUtil.2"), //
	DELEGATEI18NHANDLER_0("DelegateI18nHandler.0"), //
	PROPURLI18NINFO_0("PropUrlI18nInfo.0"), //
	PROPERTIESI18N_0("PropertiesI18n.0"), //
	XMLPROPFILEI18NLOADER_0("XmlPropFileI18nLoader.0"), //
	XMLPROPFILEI18NLOADER_1("XmlPropFileI18nLoader.1"), //
	XMLPROPFILEI18NLOADER_2("XmlPropFileI18nLoader.2"), //
	XMLPROPFILEI18NLOADER_3("XmlPropFileI18nLoader.3"), //
	XMLPROPRESOURCEI18NLOADER_0("XmlPropResourceI18nLoader.0"), //
	XMLPROPRESOURCEI18NLOADER_1("XmlPropResourceI18nLoader.1"), //
	XMLPROPRESOURCEI18NLOADER_2("XmlPropResourceI18nLoader.2"), //
	XMLPROPRESOURCEI18NLOADER_3("XmlPropResourceI18nLoader.3"), //
	THREADSAFEUTIL_0("ThreadSafeUtil.0"), //
	FILEUTIL_0("FileUtil.0"), //
	FILEUTIL_1("FileUtil.1"), //
	FILEUTIL_2("FileUtil.2"), //
	INTERVAL_0("Interval.0"), //
	INTERVAL_1("Interval.1"), //
	INTERVAL_2("Interval.2"), //
	INTERVAL_3("Interval.3"), //
	INTERVAL_4("Interval.4"), //
	INTERVAL_5("Interval.5"), //
	INTERVAL_6("Interval.6"), //
	THREADUTIL_0("ThreadUtil.0"), //
	ABSTRACTREFERENCEMODEL_0("AbstractReferenceModel.0"), //
	IMAGEUTIL_0("ImageUtil.0"), //
	IMAGEUTIL_1("ImageUtil.1"), //
	IMAGEUTIL_2("ImageUtil.2"), //
	IMAGEUTIL_3("ImageUtil.3"), //
	IMAGEUTIL_4("ImageUtil.4"), //
	IMAGEUTIL_5("ImageUtil.5"), //
	IMAGEUTIL_6("ImageUtil.6"), //
	IMAGEUTIL_7("ImageUtil.7"), //
	IMAGEUTIL_8("ImageUtil.8"), //
	BYTEBUFFERINPUTSTREAM_0("ByteBufferInputStream.0"), //
	BYTEBUFFEROUTPUTSTREAM_0("ByteBufferOutputStream.0"), //
	DEFAULTNAMEFILTER_0("DefaultNameFilter.0"), //
	DEFAULTNAMEFILTER_1("DefaultNameFilter.1"), //
	DEFAULTNAME_0("DefaultName.0"), //
	DEFAULTTAGFILTER_0("DefaultTagFilter.0"), //
	LOG4JLOGGERINFO_0("Log4jLoggerInfo.0"), //
	DELEGATELOGGERHANDLER_0("DelegateLoggerHandler.0"), //
	DELEGATELOGGERHANDLER_1("DelegateLoggerHandler.1"), //
	DELEGATELOGGERHANDLER_2("DelegateLoggerHandler.2"), //
	WRITERLOGGER_0("WriterLogger.0"), //
	OUTPUTSTREAMLOGGER_0("OutputStreamLogger.0"), //
	CT_0("CT.0"), //
	CT_1("CT.1"), //
	CT_2("CT.2"), //
	LOGGERHANDLER_0("LoggerHandler.0"), //
	LOGGERHANDLER_1("LoggerHandler.1"), //
	INTEGRALVALUEPARSER_0("IntegralValueParser.0"), //
	LOGGERUTIL_0("LoggerUtil.0"), //
	LOGGERUTIL_1("LoggerUtil.1"), //
	LOGGERUTIL_2("LoggerUtil.2"), //
	LOGGERUTIL_3("LoggerUtil.3"), //
	LOGGERUTIL_4("LoggerUtil.4"), //
	SYNCINPUTSTREAM_0("SyncInputStream.0"), //
	SYNCOUTPUTSTREAM_0("SyncOutputStream.0"), //
	XMLJAR2REPORESOURCELOADER_0("XmlJar2RepoResourceLoader.0"), //
	XMLJAR2REPORESOURCELOADER_1("XmlJar2RepoResourceLoader.1"), //
	XMLJAR2REPORESOURCELOADER_2("XmlJar2RepoResourceLoader.2"), //
	XMLJAR2REPORESOURCELOADER_3("XmlJar2RepoResourceLoader.3"), //
	XMLJAR2REPORESOURCELOADER_4("XmlJar2RepoResourceLoader.4"), //
	ABSTRACTSETTINGHANDLER_0("AbstractSettingHandler.0"), //
	ABSTRACTSETTINGHANDLER_1("AbstractSettingHandler.1"), //
	ABSTRACTSETTINGHANDLER_2("AbstractSettingHandler.2"), //
	ABSTRACTSETTINGHANDLER_3("AbstractSettingHandler.3"), //
	ABSTRACTSETTINGHANDLER_4("AbstractSettingHandler.4"), //
	ABSTRACTSETTINGHANDLER_5("AbstractSettingHandler.5"), //
	DEFAULTSETTINGHANDLER_0("DefaultSettingHandler.0"), //
	DEFAULTSETTINGHANDLER_1("DefaultSettingHandler.1"), //
	DEFAULTSETTINGHANDLER_2("DefaultSettingHandler.2"), //
	DEFAULTSETTINGHANDLER_3("DefaultSettingHandler.3"), //
	ABSTRACTSETTINGINFO_0("AbstractSettingInfo.0"), //
	ABSTRACTSETTINGINFO_1("AbstractSettingInfo.1"), //
	SETTINGUTIL_0("SettingUtil.0"), //
	SETTINGUTIL_1("SettingUtil.1"), //
	SETTINGUTIL_2("SettingUtil.2"), //
	SETTINGUTIL_3("SettingUtil.3"), //
	SETTINGUTIL_4("SettingUtil.4"), //
	SETTINGUTIL_5("SettingUtil.5"), //
	SETTINGUTIL_6("SettingUtil.6"), //
	SETTINGUTIL_7("SettingUtil.7"), //
	SETTINGUTIL_8("SettingUtil.8"), //
	SETTINGUTIL_9("SettingUtil.9"), //
	SETTINGUTIL_10("SettingUtil.10"), //
	PROPSETTINGVALUELOADER_0("PropSettingValueLoader.0"), //
	PROPSETTINGVALUELOADER_1("PropSettingValueLoader.1"), //
	PROPSETTINGVALUESAVER_0("PropSettingValueSaver.0"), //
	PROPSETTINGVALUESAVER_1("PropSettingValueSaver.1"), //
	ABSTRACTTASK_0("AbstractTask.0"), //
	ABSTRACTPLAIN_0("AbstractPlain.0"), //
	ABSTRACTPLAIN_1("AbstractPlain.1"), //
	ABSTRACTPLAIN_2("AbstractPlain.2"), //
	FIXEDTIMEPLAIN_0("FixedTimePlain.0"), //
	FIXEDRATEPLAIN_0("FixedRatePlain.0"), //
	LISTTIMER_0("ListTimer.0"), //
	LISTTIMER_1("ListTimer.1"), //
	LISTTIMER_2("ListTimer.2"), //
	TIMERUTIL_0("TimerUtil.0"), //
	TIMERUTIL_1("TimerUtil.1"), //
	TIMERUTIL_2("TimerUtil.2"), //
	TIMERUTIL_3("TimerUtil.3"), //
	NUMBERSETTINGINFO_0("NumberSettingInfo.0"), //
	MUACOMBOBOXMODEL_0("MuaComboBoxModel.0"), //
	MUACOMBOBOXMODEL_1("MuaComboBoxModel.1"), //
	ATTRIBUTECOMPLEX_0("AttributeComplex.0"), //
	ATTRIBUTECOMPLEX_1("AttributeComplex.1"), //
	ATTRIBUTECOMPLEX_2("AttributeComplex.2"), //
	ATTRIBUTECOMPLEX_3("AttributeComplex.3"), //
	ATTRIBUTECOMPLEX_4("AttributeComplex.4"), //
	ATTRIBUTECOMPLEX_5("AttributeComplex.5"), //
	ATTRIBUTECOMPLEX_6("AttributeComplex.6"), //
	ATTRIBUTECOMPLEX_7("AttributeComplex.7"), //
	ATTRIBUTECOMPLEX_8("AttributeComplex.8"), //

	;

	private String name;

	private ExceptionStringKey(String name) {
		this.name = name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return name;
	}
}
