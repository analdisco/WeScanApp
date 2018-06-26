package viewModelFactories.activities

import viewModelFactories.BaseVMF
import viewModels.activities.ScanActivityVM

class ScanActivityVMF : BaseVMF<ScanActivityVM>() {
    override fun mock(): ScanActivityVM {
        val viewModel = ScanActivityVM()

        return viewModel
    }
}