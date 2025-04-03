import java.awt.event.KeyEvent;
import java.util.Set;

import static utils.Constants.*;

public class Player extends Sprite {

    public Player() {
        super(PLAYER_IMAGE_PATH, 0, 0, PLAYER_WIDTH, PLAYER_HEIGHT);
    }

    @Override
    public void tick() {
        getPos().x = Math.clamp(getPos().x, 0, BOARD_WIDTH - PLAYER_WIDTH);
        getPos().y = Math.clamp(getPos().y, 0, BOARD_HEIGHT - PLAYER_HEIGHT);
    }

    public void handleActiveKeys(Set<Integer> activeKeyCodes) {
        if (activeKeyCodes.contains(KeyEvent.VK_W)) {
            getPos().y -= PLAYER_SPEED;
        }
        if (activeKeyCodes.contains(KeyEvent.VK_S)) {
            getPos().y += PLAYER_SPEED;
        }
        if (activeKeyCodes.contains(KeyEvent.VK_A)) {
            getPos().x -= PLAYER_SPEED;
        }
        if (activeKeyCodes.contains(KeyEvent.VK_D)) {
            getPos().x += PLAYER_SPEED;
        }
    }
}
