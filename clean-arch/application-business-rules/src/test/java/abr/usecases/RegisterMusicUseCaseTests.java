package abr.usecases;

import ebr.entities.Music;
import org.junit.jupiter.api.Test;
import ports.MusicRepositoryPort;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RegisterMusicUseCaseTests {

    //    private final MusicCreatorMockAdapter musicCreator = new MusicCreatorMockAdapter();
//    private final MusicCreatorPort musicCreator = mock(MusicCreatorPort.class);
//    private final MusicRepositoryPort musicRepository = new MusicRepositoryInMemoryAdapter();
    private final MusicRepositoryPort musicRepository = mock(MusicRepositoryPort.class);
    private final RegisterMusicUseCase uc = new RegisterMusicUseCase(musicRepository);

    @Test
    void registerMusicUseCaseTest() {
        Music mockedMusic = new Music().setName("Hotel Califórnia");
        when(musicRepository.create(any())).thenReturn(mockedMusic);
        Music music = new Music().setName("Hotel Califórnia");
        Music created = uc.execute(music);
        System.out.println(created);
    }
}
