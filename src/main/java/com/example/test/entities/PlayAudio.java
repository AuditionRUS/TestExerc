package com.example.test.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayAudio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int playListId;
    private int AudioId;
}