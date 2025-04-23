// SPDX-FileCopyrightText: 2025 Simon Massey
// SPDX-License-Identifier: Apache-2.0
package io.github.simbo1905.simple_pickle.protocol;

public record Failure(String errorMessage) implements StackResponse {
  public String payload() {
    return errorMessage;
  }
}
