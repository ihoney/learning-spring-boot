package com.example.configuration;

import com.example.entity.Team;
import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;
import java.util.Optional;

/**
 * Created by floodliu on 16/5/29.
 */
public class TeamEditor extends PropertyEditorSupport {

    /*
     * 参数(字符串类型) 转换成 Java Object
     */
    @Override
    public void setAsText(String name) throws IllegalArgumentException {
        if (StringUtils.hasText(name)) {
            setValue(new Team(name));
        } else {
            setValue(null);
        }
    }

    /*
     * Java Object 转换成 字符串
     */

    @Override
    public String getAsText() {
        Optional<Team> team = Optional.ofNullable((Team) getValue());
        if (team.isPresent()) {
            return team.get().getName();
        } else {
            return "";
        }
    }
}
