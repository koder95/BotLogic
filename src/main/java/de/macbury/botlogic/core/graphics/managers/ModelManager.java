package de.macbury.botlogic.core.graphics.managers;

import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader;
import com.badlogic.gdx.utils.UBJsonReader;
import de.macbury.botlogic.core.entites.Entity;

import java.util.Map;

/**
 * Created by macbury on 11.04.14.
 */
public class ModelManager {
  private final Map<Class<? extends Entity>, Model> models;

  public ModelManager(Map<Class<? extends Entity>, Model> modelMap) {
    this.models = modelMap;
  }

  public Model getModelFor(Class<? extends Entity> clazz) {
    return this.models.get(clazz);
  }
}
