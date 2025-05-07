package com.example.part35teammonew.domain.userActivity.maper;

import com.example.part35teammonew.domain.userActivity.Dto.InterestView;
import com.example.part35teammonew.domain.userActivity.Dto.UserActivityDto;
import com.example.part35teammonew.domain.userActivity.entity.UserActivity;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-07T11:29:28+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class UserActivityMapperImpl implements UserActivityMapper {

    @Override
    public UserActivityDto toDto(UserActivity userActivity) {
        if ( userActivity == null ) {
            return null;
        }

        UserActivityDto userActivityDto = new UserActivityDto();

        userActivityDto.setNickname( userActivity.getNickName() );
        userActivityDto.setUserId( userActivity.getUserId() );
        userActivityDto.setEmail( userActivity.getEmail() );
        userActivityDto.setCreatedAt( userActivity.getCreatedAt() );
        Set<InterestView> set = userActivity.getSubscriptions();
        if ( set != null ) {
            userActivityDto.setSubscriptions( new LinkedHashSet<InterestView>( set ) );
        }

        reverseFields( userActivity, userActivityDto );

        return userActivityDto;
    }
}
