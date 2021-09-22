package kg.geektech.les8.players;

import kg.geektech.les8.players.GameEntity;

public class Boss<deafen> extends GameEntity {
    private boolean isDeafen;
    public Boss(int health, int damage) {
        super(health, damage);
    }

    public boolean isDeafen() {
        return isDeafen;
    }

    public void setDeafen(boolean deafen) {
        isDeafen = deafen;
    }




}
