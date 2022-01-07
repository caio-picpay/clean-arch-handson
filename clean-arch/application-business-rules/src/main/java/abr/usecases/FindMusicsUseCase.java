package abr.usecases;

import ebr.entities.Music;
import lombok.AllArgsConstructor;
import ports.MusicRepositoryPort;

import java.util.List;

@AllArgsConstructor
public class FindMusicsUseCase implements UseCase<Void, List<Music>>{

    private final MusicRepositoryPort musicRepository;

    @Override
    public List<Music> execute(Void input) {
        return musicRepository.findAll();
    }
}
