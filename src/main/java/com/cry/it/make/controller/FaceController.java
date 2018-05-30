package com.cry.it.make.controller;

import com.cry.it.make.domain.CryFace;
import com.cry.it.make.domain.SmileFace;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class FaceController {

    @GetMapping("/face")
    public String face(Map<String, Object> model) {
        model.put("face", new SmileFace().face());
        return "face";
    }
}
