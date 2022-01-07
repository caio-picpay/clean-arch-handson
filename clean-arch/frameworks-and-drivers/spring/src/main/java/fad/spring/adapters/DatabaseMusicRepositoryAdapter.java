package fad.spring.adapters;

import ebr.entities.Music;
import fad.spring.data.MusicEntity;
import fad.spring.data.MusicRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ports.MusicRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
@AllArgsConstructor
public class DatabaseMusicRepositoryAdapter implements MusicRepositoryPort {

    private final MusicRepository musicRepository;

    @Override
    public Music create(Music music) {
        MusicEntity entity = MusicEntity
                .builder()
                .id(music.getId())
                .name(music.getName())
                .build();
        musicRepository.save(entity);
        return null;
    }

    @Override
    public List<Music> findAll() {
        return StreamSupport
                .stream(musicRepository.findAll().spliterator(), false)
                .map(entity -> Music
                        .builder()
                        .id(entity.getId())
                        .name(entity.getName())
                        .build()).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return (int) musicRepository.count();
    }
}
