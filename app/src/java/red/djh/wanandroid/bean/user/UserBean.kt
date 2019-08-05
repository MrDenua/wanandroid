package red.djh.wanandroid.bean.user

/**
 * author : dengzi
 * e-mail : denua@foxmail.com
 * time   : 2019/08/02 16:34
 * desc   :
 */
data class UserBean(
    val username: String,
    val nickname: String,
    val email: String,
    val chapterTops: List<String>,
    val collectIds: List<String>,
    val admin: Boolean,
    val icon: String,
    val id: String,
    val password: String,
    val token: String,
    val type: String
)