package abr.usecases;

import ebr.entities.Music;
import lombok.AllArgsConstructor;
import ports.MusicRepositoryPort;

import java.util.UUID;

@AllArgsConstructor
public class RegisterMusicUseCase implements UseCase<Music, Music> {

    private final MusicRepositoryPort musicRepo;

    @Override
    public Music execute(Music input) {
        String id = UUID.randomUUID().toString();
        Music music = input.setId(id);
        return musicRepo.create(music);
    }
}
