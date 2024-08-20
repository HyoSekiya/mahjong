package com.example.mahjong.api.response;

import com.example.mahjong.domain.role.WinningRole;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Response {

    private final List<Map<String, String>> returnList;

    public Response(List<Map<String, String>> returnList) {
        this.returnList = returnList;
    }

    public static List<Map<String, String>> toResponse(List<WinningRole> winningRolelist){
        List<Map<String, String>> returnList = winningRolelist
                .stream()
                .map(WinningRole::getReturnList)
                .collect(Collectors.toList());

        return new Response(returnList).returnList;
    }
}
