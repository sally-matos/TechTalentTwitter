package com.tts.TechTalentTwitter.repository;

import com.tts.TechTalentTwitter.model.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository <Tag, Long>{
    public Tag findByPhrase(String phrase);
}
