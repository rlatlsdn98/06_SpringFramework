package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// Bean 등록
@Service("pokemonServiceQualifier")
public class PokemonService {

  /* -
  -
  - 필드, 생성자 주입 가능 */

  @Autowired
  @Qualifier("squirtle")
  private Pokemon pokemon;

  public void pokemonAttack(){
    pokemon.attack();
  }

}
