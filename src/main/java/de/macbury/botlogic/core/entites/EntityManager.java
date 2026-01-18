package de.macbury.botlogic.core.entites;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Created by macbury on 11.04.14.
 */
public class EntityManager {

  private final Map<Class<? extends Entity>, Entity> entities;

  public EntityManager(Map<Class<? extends Entity>, Entity> entities) {
      this.entities = Map.copyOf(entities);
  }

  public <T extends Entity> Optional<T> find(Class<T> clazz) {
    return Optional.ofNullable(clazz.cast(entities.get(clazz)));
  }

  public <T extends Entity> T get(Class<T> clazz) {
    return find(clazz).orElseThrow(
            () -> new NoSuchElementException(clazz.getTypeName() + " instance not found!")
    );
  }
}
