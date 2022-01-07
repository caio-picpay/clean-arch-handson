package abr.usecases;

import ebr.entities.Music;
import ports.MusicCreatorPort;

public class MusicCreatorMockAdapter implements MusicCreatorPort {
    @Override
    public void create(Music music) {
        System.out.println("created");
    }
}
