package com.dwarfeng.dutil.develop.setting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dwarfeng.dutil.develop.cfg.checker.BooleanConfigChecker;
import com.dwarfeng.dutil.develop.cfg.parser.BooleanValueParser;
import com.dwarfeng.dutil.develop.setting.SettingHandler.Entry;

public class Test_SyncEntrySet {

	private static final Entry ENTRY_1 = SettingUtil.quickEntry(TestEntry.ENTRY_1.getName(),
			TestEntry.ENTRY_1.getConfigChecker(), TestEntry.ENTRY_1.getValueParser(),
			TestEntry.ENTRY_1.getInitialValue());
	private static final Entry ENTRY_1F = SettingUtil.quickEntry(TestEntry.ENTRY_1.getName(),
			TestEntry.ENTRY_1.getConfigChecker(), TestEntry.ENTRY_1.getValueParser(), "FALSE");
	private static final Entry ENTRY_2 = SettingUtil.quickEntry(TestEntry.ENTRY_2.getName(),
			TestEntry.ENTRY_2.getConfigChecker(), TestEntry.ENTRY_2.getValueParser(),
			TestEntry.ENTRY_2.getInitialValue());
	private static final Entry ENTRY_3 = SettingUtil.quickEntry(TestEntry.ENTRY_3.getName(),
			TestEntry.ENTRY_3.getConfigChecker(), TestEntry.ENTRY_3.getValueParser(),
			TestEntry.ENTRY_3.getInitialValue());
	private static final Entry ENTRY_4 = SettingUtil.quickEntry(TestEntry.ENTRY_4.getName(),
			TestEntry.ENTRY_4.getConfigChecker(), TestEntry.ENTRY_4.getValueParser(),
			TestEntry.ENTRY_4.getInitialValue());
	private static final Entry ENTRY_5 = SettingUtil.quickEntry("entry.5", new BooleanConfigChecker(),
			new BooleanValueParser(), "TRUE");

	private static SettingHandler handler;
	private static TestSettingObverser obv;
	private static Set<Entry> entrySet;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		handler = SettingUtil.syncSettingHandler(new DefaultSettingHandler(new LinkedHashMap<>(), new LinkedHashMap<>(),
				Collections.newSetFromMap(new WeakHashMap<>())));
		SettingUtil.putEnumItems(TestEntry.class, handler);
		entrySet = handler.entrySet();
		obv = new TestSettingObverser();
		handler.addObverser(obv);
	}

	@After
	public void tearDown() throws Exception {
		handler.clearObverser();
		entrySet = null;
		handler = null;
		obv = null;
	}

	@Test
	public final void testSize() {
		assertEquals(4, entrySet.size());
	}

	@Test
	public final void testIsEmpty() {
		assertFalse(entrySet.isEmpty());
		entrySet.clear();
		assertTrue(entrySet.isEmpty());
		assertTrue(handler.isEmpty());
	}

	@Test
	public final void testClear() {
		entrySet.clear();
		assertTrue(entrySet.isEmpty());
		assertTrue(handler.isEmpty());
		assertEquals(1, obv.clearCount);
	}

	@Test
	public final void testContainsObject() {
		assertFalse(entrySet.contains("entry.1"));
		assertTrue(entrySet.contains(ENTRY_1));
		assertTrue(entrySet.contains(ENTRY_2));
		assertTrue(entrySet.contains(ENTRY_3));
		assertTrue(entrySet.contains(ENTRY_4));
		assertTrue(entrySet.contains(
				SettingUtil.quickEntry("entry.1", new BooleanConfigChecker(), new BooleanValueParser(), "TRUE")));
	}

	@Test
	public final void testIterator() {
		Iterator<Entry> iterator = entrySet.iterator();

		assertTrue(iterator.hasNext());
		assertEquals(ENTRY_1, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(ENTRY_2, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(ENTRY_3, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(ENTRY_4, iterator.next());
		assertFalse(iterator.hasNext());
	}

	@Test(expected = NoSuchElementException.class)
	public final void testIterator1() {
		Iterator<Entry> iterator = entrySet.iterator();

		iterator.next();
		iterator.next();
		iterator.next();
		iterator.next();
		iterator.next();
		fail("没有抛出异常");
	}

	@Test
	public final void testIterator2() {
		Iterator<Entry> iterator = entrySet.iterator();

		iterator.next();
		iterator.remove();
		iterator.next();
		iterator.next();
		iterator.remove();
		assertEquals(2, entrySet.size());
		assertTrue(entrySet.containsAll(Arrays.asList(ENTRY_2, ENTRY_4)));
		assertEquals(2, obv.removedKey.size());
		assertEquals("entry.1", obv.removedKey.get(0));
		assertEquals("entry.3", obv.removedKey.get(1));
	}

	@Test(expected = IllegalStateException.class)
	public final void testIterator3() {
		Iterator<Entry> iterator = entrySet.iterator();

		iterator.remove();
		fail("没有抛出异常");
	}

	@Test(expected = IllegalStateException.class)
	public final void testIterator4() {
		Iterator<Entry> iterator = entrySet.iterator();

		iterator.next();
		iterator.remove();
		iterator.remove();
		fail("没有抛出异常");
	}

	@Test(expected = UnsupportedOperationException.class)
	public final void testAddEntry() {
		entrySet.add(ENTRY_5);
		fail("没有抛出异常。");
	}

	@Test
	public final void testRemoveObject() {
		assertFalse(entrySet.remove(ENTRY_5));
		assertFalse(entrySet.remove(ENTRY_1F));
		assertTrue(entrySet.remove(ENTRY_2));
		assertEquals(1, obv.removedKey.size());
		assertEquals("entry.2", obv.removedKey.get(0));
		assertTrue(entrySet.remove(ENTRY_1));
		assertEquals(2, obv.removedKey.size());
		assertEquals("entry.1", obv.removedKey.get(1));
	}

	@Test(expected = UnsupportedOperationException.class)
	public final void testAddAllCollectionOfQextendsEntry() {
		entrySet.addAll(Collections.emptySet());
		fail("没有抛出异常。");
	}

	@Test
	public final void testRetainAllCollectionOfQ() {
		assertTrue(entrySet.retainAll(Arrays.asList(ENTRY_2, ENTRY_3)));
		assertEquals(2, entrySet.size());
		assertEquals(2, handler.size());
		assertTrue(entrySet.contains(ENTRY_2));
		assertTrue(entrySet.contains(ENTRY_3));
		assertEquals(2, obv.removedKey.size());
		assertEquals("entry.1", obv.removedKey.get(0));
		assertEquals("entry.4", obv.removedKey.get(1));
		assertFalse(entrySet.retainAll(Arrays.asList(ENTRY_2, ENTRY_3)));
	}

	@Test
	public final void testRemoveAllCollectionOfQ() {
		assertTrue(entrySet.removeAll(Arrays.asList(ENTRY_2, ENTRY_3)));
		assertEquals(2, entrySet.size());
		assertEquals(2, handler.size());
		assertTrue(entrySet.contains(ENTRY_1));
		assertTrue(entrySet.contains(ENTRY_4));
		assertEquals(2, obv.removedKey.size());
		assertEquals("entry.2", obv.removedKey.get(0));
		assertEquals("entry.3", obv.removedKey.get(1));
		assertFalse(entrySet.removeAll(Arrays.asList(ENTRY_2, ENTRY_3)));
	}

	@Test
	public final void testHashCode() {
		Set<Entry> anotherEntrySet = new HashSet<>();
		anotherEntrySet.add(ENTRY_1);
		anotherEntrySet.add(ENTRY_2);
		anotherEntrySet.add(ENTRY_3);
		anotherEntrySet.add(ENTRY_4);
		assertTrue(entrySet.hashCode() == anotherEntrySet.hashCode());
	}

	@Test
	public final void testEquals() {
		Set<Entry> anotherEntrySet = new HashSet<>();
		anotherEntrySet.add(ENTRY_1);
		anotherEntrySet.add(ENTRY_2);
		anotherEntrySet.add(ENTRY_3);
		anotherEntrySet.add(ENTRY_4);
		assertTrue(entrySet.equals(anotherEntrySet));
	}

	@Test
	public final void testToArray() {
		assertArrayEquals(new Object[] { ENTRY_1, ENTRY_2, ENTRY_3, ENTRY_4 }, entrySet.toArray());
	}

	@Test
	public final void testToArrayTArray() {
		assertArrayEquals(new Object[] { ENTRY_1, ENTRY_2, ENTRY_3, ENTRY_4 },
				entrySet.toArray(new SettingHandler.Entry[0]));
		assertArrayEquals(new Object[] { ENTRY_1, ENTRY_2, ENTRY_3, ENTRY_4, null, null },
				entrySet.toArray(new SettingHandler.Entry[6]));
	}

	@Test
	public final void testContainsAll() {
		assertTrue(entrySet.containsAll(Arrays.asList(ENTRY_1, ENTRY_2, ENTRY_3, ENTRY_4)));
		assertFalse(entrySet.containsAll(Arrays.asList(ENTRY_1, ENTRY_2, ENTRY_3, ENTRY_4, ENTRY_5)));
	}

}