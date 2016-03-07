# Some common iterators for Java

[![Build Status](https://travis-ci.org/markenwerk/android-commons-iterables.svg?branch=master)](https://travis-ci.org/markenwerk/android-commons-iterables)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.markenwerk/android-commons-iterables/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.markenwerk/android-commons-iterables)
[![API Level 8](https://img.shields.io/badge/android-API_8-brightgreen.svg)](https://developer.android.com/reference/packages.html)
[![MIT License](https://img.shields.io/badge/license-MIT-brightgreen.svg)](https://github.com/markenwerk/android-commons-iterables/blob/master/LICENSE)

## Overview

This is a collection of companion `Iterables` for [some commonly useful `Iterator` implementations](https://github.com/markenwerk/android-commons-iterators) for the following use cases:

- [Iterating over sparse arrays](#iterating-over-sparse-arrays)
- [Iterating over other objects](#iterating-over-other-objects)

This library is an extensions of the [corresponding library for Java](https://github.com/markenwerk/java-commons-iterables), that contains `Iterables` for Android specific data structures.

This library is hosted in the [Maven Central Repository](https://maven-badges.herokuapp.com/maven-central/net.markenwerk/android-commons-iterables). You can use it with the following coordinates:

```gradle
compile 'net.markenwerk:android-commons-iterables:2.2.0'
```

Consult the [usage description](#usage) and [Javadoc](https://markenwerk.github.io/android-commons-iterables/index.html) for further information.

## Usage

### Iterating over sparse arrays

This library provides the following [`Iterables`][Iterable] that take existing sparse arrays and generate
[`Iterables`][Iterable] and yield all elements of the given array wrapped in an [`Entry`][Entry]:

- [`LongSparseArrayIterable`][LongSparseArrayIterable]
- [`SparseArrayIterable`][SparseArrayIterable]
- [`SparseBooleanArrayIterable`][SparseBooleanArrayIterable]
- [`SparseIntegerArrayIterable`][SparseIntegerArrayIterable]
- [`SparseLongArrayIterable`][SparseLongArrayIterable]

```java
SparseArray<Foo> sparseArray = ...

// generated iterables yield every foo from sparseArray
Iterable<Entry<Integer, Foo>> arraytIterable = new SparseArrayIterable<>(sparseArray);
```

### Iterating over other objects

This library provides the generic [`PairIterable`][PairIterable] that takes and existing [`Pair`][Pair] and
generates [`Iterators`][Iterator] that yield both contained values.

```java
Pair<Foo, Foo> pair = ...

// yields both foos from pair
Iterable<Foo> pairIterator = new PairIterable<>(pair);
```

[LongSparseArrayIterable]: https://markenwerk.github.io/android-commons-iterables/index.html?net/markenwerk/android/commons/iterables/LongSparseArrayIterable.html
[PairIterable]: https://markenwerk.github.io/android-commons-iterables/index.html?net/markenwerk/android/commons/iterables/PairIterable.html
[SparseArrayIterable]: https://markenwerk.github.io/android-commons-iterables/index.html?net/markenwerk/android/commons/iterables/SparseArrayIterable.html
[SparseBooleanArrayIterable]: https://markenwerk.github.io/android-commons-iterables/index.html?net/markenwerk/android/commons/iterables/SparseBooleanArrayIterable.html
[SparseIntegerArrayIterable]: https://markenwerk.github.io/android-commons-iterables/index.html?net/markenwerk/android/commons/iterables/SparseIntegerArrayIterable.html
[SparseLongArrayIterable]: https://markenwerk.github.io/android-commons-iterables/index.html?net/markenwerk/android/commons/iterables/SparseLongArrayIterable.html

[Entry]: https://markenwerk.github.io/java-commons-datastructures/index.html?net/markenwerk/commons/datastructures/Entry.html

[Iterable]: https://developer.android.com/reference/java/lang/Iterable.html
[Iterator]: https://developer.android.com/reference/java/util/Iterator.html
[Pair]: https://developer.android.com/reference/android/util/Pair.html
