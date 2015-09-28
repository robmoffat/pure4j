/**
 *   Copyright (c) Rich Hickey. All rights reserved.
 *   The use and distribution terms for this software are covered by the
 *   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *   which can be found in the file epl-v10.html at the root of this distribution.
 *   By using this software in any fashion, you are agreeing to be bound by
 * 	 the terms of this license.
 *   You must not remove this notice, or any other, from this software.
 **/

/* rich Jul 17, 2009 */

package org.pure4j.collections;


public interface ITransientMap<K, V> extends Counted {

	ITransientMap<K, V> assoc(K key, V val);

	ITransientMap<K, V> without(Object key);

	IPersistentMap<K, V> persistent();

	V valAt(Object key, V object);

	V valAt(Object key);
}
