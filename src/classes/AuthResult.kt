package classes

/**
 * Created by pranavkonduru on 9/4/18.
 */
sealed class AuthResult {
    object Processing: AuthResult()
    data class Error(val statusCode: Int, val exception: Throwable) : AuthResult()
    data class Success(val response: String) : AuthResult()
}