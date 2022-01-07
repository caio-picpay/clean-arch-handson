package fad.spring.data;

import org.springframework.data.repository.CrudRepository;

public interface MusicRepository extends CrudRepository<MusicEntity, String> {
}
