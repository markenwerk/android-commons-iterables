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

import android.util.SparseArray;

import net.markenwerk.android.commons.iterators.SparseArrayIterator;
import net.markenwerk.commons.datastructures.Entry;
import net.markenwerk.commons.iterables.ProtectedIterable;

import java.util.Iterator;

/**
 * An {@link SparseArrayIterable} is a {@link ProtectedIterable} that generates
 * {@link Iterator Iterators} that iterate over a given {@link android.util.SparseArray}.
 * <p/>
 * Calling {@link SparseArrayIterable#iterator()} creates an instance of
 * {@link SparseArrayIterator}.
 * <p/>
 *
 * @param <Payload> The payload type.
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 2.2.0
 */
public final class SparseArrayIterable<Payload> implements ProtectedIterable<Entry<Integer, Payload>> {

	private final SparseArray<? extends Payload> array;

	/**
	 * Creates a new {@link SparseArrayIterable} for the given {@link android.util.SparseArray}.
	 *
	 * @param array The {@link android.util.SparseArray} to iterate over.
	 * @throws IllegalArgumentException If the given {@link android.util.SparseArray} is {@literal null}.
	 */
	public SparseArrayIterable(SparseArray<? extends Payload> array) throws IllegalArgumentException {
		if (null == array) {
			throw new IllegalArgumentException("array is null");
		}
		this.array = array;
	}

	@Override
	public SparseArrayIterator<Payload> iterator() {
		return new SparseArrayIterator<>(array);
	}

}
