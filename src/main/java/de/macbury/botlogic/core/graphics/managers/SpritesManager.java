package de.macbury.botlogic.core.graphics.managers;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g3d.decals.Decal;

/**
 * Created by macbury on 12.04.14.
 */
public class SpritesManager {
  private final TextureAtlas effectsAtlas;

  public SpritesManager(TextureAtlas textureAtlas) {
    this.effectsAtlas = textureAtlas;
  }

  public Decal sonarDecal() {
    Decal decal = Decal.newDecal(this.effectsAtlas.findRegion("sonar_ping"), true);
    decal.setWidth(1);
    decal.setHeight(1);
    decal.rotateX(90);
    return decal;
  }
}
