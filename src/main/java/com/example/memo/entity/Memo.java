package com.example.memo.entity;

import com.example.memo.dto.MemoRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Memo {
    private Long id;
    private String title;
    private String contents;

    public void update(MemoRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
    }

    public void updateTitle(MemoRequestDto requestDto){
        this.title = requestDto.getTitle();
    }
}