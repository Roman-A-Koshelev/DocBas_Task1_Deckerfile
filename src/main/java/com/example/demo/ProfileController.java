package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    @PostMapping()
    public Profile createProfile(@RequestBody Profile profile) {
        return profileRepository.save(profile);
    }

    @GetMapping("/{profileId}")
    public Profile findProfile(@PathVariable Long profileId) {
        return profileRepository.findById(profileId).orElse(null);
    }

    @GetMapping()
    public List<Profile> findAllProfile() {
        return profileRepository.findAll();
    }
}
