package com.example.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

//@RepositoryRestResource(path = "todos", collectionResourceRel = "todos2")
//@RepositoryRestResource //ta adnotacja udostepnia metody na zewnatrz do zarzadzania danymi
@Repository //ta adnotacja nie udostepnia ww metod - sprawdzić czy tak jest
public interface TaskRepository extends JpaRepository<Task, Long> {

    //gdy jest adnotacja @Repository to juz nie potrzeba tych metod ograniczajacych delete
    //zalatwimy to w controllerze
//    @Override
//    @RestResource(exported = false)
//    void deleteById(Long aLong);

//    @Override
//    @RestResource(exported = false)
//    void delete(Task task);

//    @RestResource(path = "done", rel = "done")
//    List<Task> findByDoneIsTrue();
//
//    @RestResource(path = "done2", rel = "done2")
//    List<Task> findByDone(@Param("state") boolean done);
//
//    @RestResource(path = "desc", rel = "description")
//    List<Task> findByDoneIsFalse();
}
