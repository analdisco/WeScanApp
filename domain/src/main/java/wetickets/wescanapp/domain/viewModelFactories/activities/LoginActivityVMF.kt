package viewModelFactories.activities

import viewModelFactories.BaseVMF
import viewModels.activities.LoginActivityVM

class LoginActivityVMF : BaseVMF<LoginActivityVM>() {
    override fun mock(): LoginActivityVM {
        val viewModel = LoginActivityVM()

        return viewModel
    }
}