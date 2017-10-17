package com.dwarfeng.dutil.basic.cna.model.obv;

import com.dwarfeng.dutil.basic.cna.model.ListModel;
import com.dwarfeng.dutil.basic.prog.Obverser;

/**
 * 列表模型观察器。
 * @author DwArFeng
 * @since 0.1.0-beta
 */
public interface ListObverser<E> extends Obverser {
	
	/**
	 * 通知模型在指定的位置增加了指定的元素。
	 * @param index 指定的位置。
	 * @param element 指定的元素。
	 */
	public void fireAdded(int index, E element);
	
	/**
	 * 通知模型在指定的位置移除了元素。
	 * @param index 指定的位置。
	 * @param element 被移除的元素。
	 */
	public void fireRemoved(int index, E element);
	
	/**
	 * 通知模型在指定的位置改变了指定的元素。
	 * @param index 指定的位置。
	 * @param oldElement 指定位置处的旧元素。
	 * @param newElement 指定位置处的新元素。
	 */
	public void fireChanged(int index, E oldElement, E newElement);
	
	/**
	 * 通知模型被清空。
	 * <p> 该方法为了提高效率而定义的，故在模型执行 {@link ListModel#clear()} 方法的时候，
	 * 会触发该通知而不是一条条地触发 {@link #fireRemoved(int, Object)}。
	 */
	public void fireCleared();

}
