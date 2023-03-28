/*
 * Copyright (C) 2021-2023 SonarSource SA
 * All rights reserved
 * mailto:info AT sonarsource DOT com
 */
package org.example;

import java.util.UUID;

public class Foo {

  private final UUID uuid;

  public Foo(Bar bar) {
    this(bar.getUuid());
  }

  public Foo(UUID uuid) {
    this.uuid = uuid;
  }

  private static class Bar {

    UUID getUuid() {
      return UUID.randomUUID();
    }

  }

}
