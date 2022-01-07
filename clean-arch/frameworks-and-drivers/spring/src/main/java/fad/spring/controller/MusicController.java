package fad.spring.controller;

import abr.usecases.FindMusicsUseCase;
import abr.usecases.RegisterMusicUseCase;
import ebr.entities.Music;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
@AllArgsConstructor
public class MusicController {

    private final RegisterMusicUseCase registerMusicUseCase;
    private final FindMusicsUseCase findMusicsUseCase;

    @PostMapping
    Music createMusic(@RequestBody Music music){
        return registerMusicUseCase.execute(music);
    }

    @GetMapping
    List<Music> findMusics(){
        return findMusicsUseCase.execute(null);
    }
}
