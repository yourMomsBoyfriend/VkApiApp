package com.fuh.testapiappsecond.model

class FriendMapper {
    fun map(apiModel: ApiModels.Friend): DomainModels.Friend = with(apiModel){
        return DomainModels.Friend(uid, "$lastName $firstName", "$cityId", domain, photo50, online == 1)
    }
}