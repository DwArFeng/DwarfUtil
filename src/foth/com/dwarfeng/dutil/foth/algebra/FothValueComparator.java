package com.dwarfeng.dutil.foth.algebra;

import java.util.Comparator;
import java.util.Objects;

import com.dwarfeng.dutil.basic.DwarfUtil;
import com.dwarfeng.dutil.basic.StringFieldKey;

/**
 * 值比较器。
 * <p> 该比较器可比较两个值对象的值大小。
 * @author DwArFeng
 * @since 0.0.2-beta
 */
public class FothValueComparator implements Comparator<FothValue> {

	/*
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(FothValue o1, FothValue o2) {
		Objects.requireNonNull(o1, DwarfUtil.getStringField(StringFieldKey.FothValueComparator_0));
		Objects.requireNonNull(o2, DwarfUtil.getStringField(StringFieldKey.FothValueComparator_0));
		return Double.compare(o1.value(), o2.value());
	}

}