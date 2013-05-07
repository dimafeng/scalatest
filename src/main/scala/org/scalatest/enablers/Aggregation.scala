/*
 * Copyright 2001-2013 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalatest.enablers

trait Aggregation[A] {
  def containsTheSameElementsAs(aggregation: A, it: Iterator[Any]): Boolean
  def containsTheSameElementsInOrderAs(aggregation: A, it: Iterator[Any]): Boolean
  def containsAllOf(aggregation: A, eles: Seq[Any]): Boolean
  def containsAnyOf(aggregation: A, eles: Seq[Any]): Boolean
  def containsOnly(aggregation: A, eles: Seq[Any]): Boolean
  def containsInOrderOnly(aggregation: A, eles: Seq[Any]): Boolean
}

