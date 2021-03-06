/* Copyright 2018 Bitwise IO, Inc.
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
------------------------------------------------------------------------------*/

package sawtooth.sdk.signing;

/**
 * A public key for an asymmetric key algorithm.
 */
public interface PublicKey {

  /**
   * Get the algorithm associated with the public key.
   *
   * @return SigningAlgorithm algorithm name.
   */
  String getAlgorithmName();

  /**
   * Get the PublicKey as hex.
   *
   * @return String public key, encoded as hex.
   */
  String hex();

  /**
   * Get the underlying bytes.
   *
   * @return the byte[] underlying the PublicKey.
   */
  byte[] getBytes();
}
