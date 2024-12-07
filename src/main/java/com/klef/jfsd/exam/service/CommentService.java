package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Comment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    public List<Comment> getAllComments() {
        List<Comment> comments = new ArrayList<>();

        comments.add(new Comment(1, "Post 1 JFSD Hackathon", "Excited for hackathon"));
        comments.add(new Comment(2, "Post 2 Lab Exam", "Get ready for the lab exam"));
        comments.add(new Comment(3, "Post 3 Project", "Great project!"));

        return comments;
    }
}
