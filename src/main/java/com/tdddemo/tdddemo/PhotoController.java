package com.tdddemo.tdddemo;

import model.Photo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/photos")
public class PhotoController {

@GetMapping
List<Photo> getAllPhotos(){
List<Photo> photos = new ArrayList<>();

    photos.add(new Photo(1,100,"Title1", "http://picmypic.com","http://tmuri.com"));
    photos.add(new Photo(2,101,"Title1", "http://picmypic.com","http://tmuri.com"));
    photos.add(new Photo(3,102,"Title1", "http://picmypic.com","http://tmuri.com"));



    return photos;
    }
}
