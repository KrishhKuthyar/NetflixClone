package com.netflix.clone.backend.entities;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;


@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private String id;
    private String userId;
    private String movieId;
    private String movieTitle;
    private String userEmail;
    private LocalDateTime movieSaveDate;
}
