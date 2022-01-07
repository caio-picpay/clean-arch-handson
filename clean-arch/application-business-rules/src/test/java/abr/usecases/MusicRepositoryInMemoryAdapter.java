package abr.usecases;

import ebr.entities.Music;
import ports.MusicRepositoryPort;

import java.util.ArrayList;
import java.util.List;

public class MusicRepositoryInMemoryAdapter implements MusicRepositoryPort {

    private final List<Music> musics = new ArrayList<>();

    @Override
    public Music create(Music music) {
        musics.add(music);
        return music;
    }

    @Override
    public List<Music> findAll() {
        return musics;
    }

    @Override
    public int count() {
        return musics.size();
    }
}
