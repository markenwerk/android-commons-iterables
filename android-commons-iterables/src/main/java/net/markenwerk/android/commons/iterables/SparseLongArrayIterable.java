/*
 * Copyright (c) 2016 Torsten Krause, Markenwerk GmbH
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.markenwerk.android.commons.iterables;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.SparseLongArray;

import net.markenwerk.android.commons.iterators.SparseLongArrayIterator;
import net.markenwerk.commons.datastructures.Entry;
import net.markenwerk.commons.iterables.ProtectedIterable;

import java.util.Iterator;

/**
 * An {@link SparseLongArrayIterable} is a {@link ProtectedIterable} that generates
 * {@link Iterator Iterators} that iterate over a given {@link SparseLongArray}.
 *
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 2.2.0
 */
@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
public final class SparseLongArrayIterable implements ProtectedIterable<Entry<Integer, Long>> {

	private final SparseLongArray array;

	/**
	 * Creates a new {@link SparseLongArrayIterable}.
	 *
	 * @param array The {@link SparseLongArray} to iterate over.
	 * @throws IllegalArgumentException If the given {@link SparseLongArray} is {@literal null}.
	 */
	public SparseLongArrayIterable(SparseLongArray array) throws IllegalArgumentException {
		if (null == array) {
			throw new IllegalArgumentException("The given array is null");
		}
		this.array = array;
	}

	@Override
	public SparseLongArrayIterator iterator() {
		return new SparseLongArrayIterator(array);
	}

}
