package org.apollo.io.player.impl;

import org.apollo.game.model.entity.Player;
import org.apollo.io.player.PlayerSaver;

/**
 * A {@link PlayerSaver} implementation that discards player data.
 * 
 * @author Graham
 */
public final class DiscardPlayerSaver implements PlayerSaver {

	@Override
	public void savePlayer(Player player) {
		/* discard player */
	}

}