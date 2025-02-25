package com.Greet.Greeting.App.Repository;

import com.Greet.Greeting.App.Model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
