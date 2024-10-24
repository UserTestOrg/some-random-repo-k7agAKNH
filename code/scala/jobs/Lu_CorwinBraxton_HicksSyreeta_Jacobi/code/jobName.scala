 val projectBasicSelection: Project.ViewSelection[AspectView, Pipeline.PipelineView[AspectView, VAspect.VAspectView, String, String, String, String], Dataset.DatasetView[VAspect.VAspectView, AspectView, String, String], Job.JobView[VAspect.VAspectView, AspectView, String], Team.TeamView[String, String, String, String, String, Member.MemberView[String], String, AspectView], GitSyncStateType.GitSyncStateTypeView, WorkingGitContextView[GitSyncLag.GitSyncLagView, ExternalSyncConfig.ExternalSyncConfigView, Branch.BranchView, Branch.BranchView], Branch.BranchView] =
    Project.view()(
      Aspect.view,
      pipelineBasicSelection,
      Dataset.view()(VAspect.view, Aspect.view, Project._id, PhysicalDataset._id),
      Job.view()(VAspect.view, Aspect.view, Project._id),
      Selectors.teamBasicSelection,
      GitSyncStateType.view,
      WorkingGitContext.view(GitSyncLag.view, ExternalSyncConfig.view, Branch.view, Branch.view),
      Branch.view
    )