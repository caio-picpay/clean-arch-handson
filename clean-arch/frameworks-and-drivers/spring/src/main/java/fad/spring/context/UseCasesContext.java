package fad.spring.context;

import abr.usecases.FindMusicsUseCase;
import abr.usecases.RegisterMusicUseCase;
import fad.spring.adapters.DatabaseMusicRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesContext {

    @Bean
    RegisterMusicUseCase registerMusicUseCase(
            DatabaseMusicRepositoryAdapter databaseMusicRepositoryAdapter
    ){
        return new RegisterMusicUseCase(databaseMusicRepositoryAdapter);
    }

    @Bean
    FindMusicsUseCase findMusicsUseCase(
            DatabaseMusicRepositoryAdapter databaseMusicRepositoryAdapter
    ){
        return new FindMusicsUseCase(databaseMusicRepositoryAdapter);
    }
}
