package com.barisetech.www.workmanage.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.barisetech.www.workmanage.bean.AccessTokenInfo;
import com.barisetech.www.workmanage.bean.TokenInfo;

/**
 * Created by LJH on 2018/8/8.
 */
@Dao
public interface AccessTokenInfoDao {

    @Query("select * from accesstoken_info where id = :id LIMIT 1")
    AccessTokenInfo loadById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(AccessTokenInfo accessTokenInfo);

    @Delete
    void delete(AccessTokenInfo accessTokenInfo);
}
