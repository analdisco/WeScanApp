package wetickets.wescanapp.domain.viewModelFactories.activities

import wetickets.wescanapp.domain.viewModelFactories.BaseVMF
import wetickets.wescanapp.domain.viewModels.activities.LoginActivityVM

class LoginActivityVMF : BaseVMF<LoginActivityVM>() {
    override fun mock(): LoginActivityVM {
        val viewModel = LoginActivityVM()

        return viewModel
    }
}