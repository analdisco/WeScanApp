package wetickets.wescanapp.domain.viewModelFactories.loginActivity

import wetickets.wescanapp.domain.viewModelFactories.BaseVMF
import wetickets.wescanapp.domain.viewModels.LoginActivityVM

class LoginActivityVMF : BaseVMF<LoginActivityVM>() {
    override fun create(): LoginActivityVM {
        val viewModel = LoginActivityVM()

        return viewModel
    }
}