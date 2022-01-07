package ports;

import ebr.entities.Music;

import java.util.List;

public interface MusicRepositoryPort {
    Music create(Music music);
    List<Music> findAll();
    int count();
}
