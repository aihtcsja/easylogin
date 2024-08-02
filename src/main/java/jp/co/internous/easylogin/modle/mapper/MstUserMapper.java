package jp.co.internous.easylogin.modle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.easylogin.modle.domain.MstUser;

@Mapper

public interface MstUserMapper {
	@Select("SELECT * FROM mus_user WHERE user_name = #{UserName} AND password = #{password}")
	MstUser findByUserNameAndPassword(String userName, String password);

}
