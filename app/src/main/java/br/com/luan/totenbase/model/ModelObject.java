package br.com.luan.totenbase.model;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;

/**
 * Created by Luan on 09/05/17.
 */
@RealmClass
public class ModelObject implements RealmModel {
    @PrimaryKey
    private String id;
    private String nome;

}
