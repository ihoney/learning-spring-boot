package com.example.configuration;

import com.example.entity.Team;
import org.springframework.format.Formatter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.Locale;
import java.util.Objects;

/**
 * Created by floodliu on 16/5/29.
 */
public class TeamFormatter implements Formatter<Team> {

    /*
     * 字符串 --> Team对象
     */
    @Override
    public Team parse(String name, Locale locale) throws ParseException {
        if (StringUtils.hasText(name)) {
            return new Team(name);
        } else {
            return null;
        }
    }

    /*
     * Team对象 --> 字符串
     */
    @Override
    public String print(Team team, Locale locale) {
        if (Objects.nonNull(team)) {
            return team.getName();
        } else {
            return "";
        }
    }
}
