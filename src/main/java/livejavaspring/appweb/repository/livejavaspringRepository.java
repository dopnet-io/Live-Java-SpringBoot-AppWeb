package livejavaspring.appweb.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import livejavaspring.appweb.entity.livejavaspringEntity;

public interface livejavaspringRepository extends JpaRepository <livejavaspringEntity, Long> {
    
    List<livejavaspringEntity> findByTitulo(String titulo);

    List<livejavaspringEntity> findByDescricao(String descricao);
}